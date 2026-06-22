package dao;

import config.Conexion;
import entity.Entity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntityDAO {


    public void crearEntityDAO(Entity ent, int idUser) {
        String sql = """
            INSERT INTO entity 
            (name, id_dimension, id_zone, id_address, id_state, description, phone, email, www, link, id_user_create, id_user_update, date_create, date_update) 
            VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NOW(), NOW());
            """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, ent.getName());
            ps.setInt(2, ent.getIdDimension());
            ps.setInt(3, ent.getIdZone());
            ps.setInt(4, ent.getIdAddress());
            ps.setInt(5, ent.getIdState());
            ps.setString(6, ent.getDescription());
            ps.setString(7, ent.getPhone());
            ps.setString(8, ent.getEmail());
            ps.setString(9, ent.getWww());
            ps.setString(10, ent.getLink());
            ps.setInt(11, idUser);
            ps.setInt(12, idUser);

            ps.executeUpdate();
            System.out.println("¡Entidad creada con éxito!");

        } catch (SQLException e) {
            System.out.println("Error al intentar crear la entidad: " + e.getMessage());
            e.printStackTrace();
        }
    }


    public void modificarEntityDAO(Entity ent, int idUserUpdate) {
        String sql = """
            UPDATE entity 
            SET name = ?, id_dimension = ?, id_zone = ?, id_address = ?, id_state = ?, description = ?, phone = ?, email = ?, www = ?, link = ?, id_user_update = ?, date_update = NOW() 
            WHERE id_entity = ?;
            """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, ent.getName());
            ps.setInt(2, ent.getIdDimension());
            ps.setInt(3, ent.getIdZone());
            ps.setInt(4, ent.getIdAddress());
            ps.setInt(5, ent.getIdState());
            ps.setString(6, ent.getDescription());
            ps.setString(7, ent.getPhone());
            ps.setString(8, ent.getEmail());
            ps.setString(9, ent.getWww());
            ps.setString(10, ent.getLink());
            ps.setInt(11, idUserUpdate);
            ps.setInt(12, idUserUpdate);

            ps.executeUpdate();
            System.out.println("¡Entidad modificada con éxito!");

        } catch (SQLException e) {
            System.out.println("Error al intentar modificar la entidad: " + e.getMessage());
            e.printStackTrace();
        }
    }


    public void borrarEntityDAO(int idEntity) {
        String sql = """
            DELETE FROM entity WHERE id_entity = ?;
            """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idEntity);

            ps.executeUpdate();
            System.out.println("¡Entidad borrada con éxito!");

        } catch (SQLException e) {
            System.out.println("Error al intentar borrar la entidad: " + e.getMessage());
            e.printStackTrace();
        }
    }


    public List<Entity> listar() {
        String sql = "SELECT * FROM entity";
        List<Entity> lista = new ArrayList<>();

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Entity ent = new Entity();

                ent.setIdEntity(rs.getInt("id_entity"));
                ent.setName(rs.getString("name"));
                ent.setIdDimension(rs.getInt("id_dimension"));
                ent.setIdZone(rs.getInt("id_zone"));
                ent.setIdAddress(rs.getInt("id_address"));
                ent.setIdState(rs.getInt("id_state"));
                ent.setDescription(rs.getString("description"));
                ent.setPhone(rs.getString("phone"));
                ent.setEmail(rs.getString("email"));
                ent.setWww(rs.getString("www"));
                ent.setLink(rs.getString("link"));
                ent.setDateCreate(rs.getTimestamp("date_create"));
                ent.setDateUpdate(rs.getTimestamp("date_update"));

                lista.add(ent);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar entidades: " + e.getMessage());
            e.printStackTrace();
        }

        return lista;
    }

//Modificadores "update" especificos

    public void modificarNameDAO(int idEntity, String nuevoName, int idUserUpdate) {
        String sql = "UPDATE entity SET name = ?, id_user_update = ?, date_update = NOW() WHERE id_entity = ?;";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevoName);
            ps.setInt(2, idUserUpdate);
            ps.setInt(3, idEntity);
            ps.executeUpdate();
            System.out.println("¡Nombre de la entidad actualizado!");
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void modificarDimensionDAO(int idEntity, int nuevoIdDimension, int idUserUpdate) {
        String sql = "UPDATE entity SET id_dimension = ?, id_user_update = ?, date_update = NOW() WHERE id_entity = ?;";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, nuevoIdDimension);
            ps.setInt(2, idUserUpdate);
            ps.setInt(3, idEntity);
            ps.executeUpdate();
            System.out.println("¡Dimensión de la entidad actualizada!");
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void modificarZoneDAO(int idEntity, int nuevoIdZone, int idUserUpdate) {
        String sql = "UPDATE entity SET id_zone = ?, id_user_update = ?, date_update = NOW() WHERE id_entity = ?;";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, nuevoIdZone);
            ps.setInt(2, idUserUpdate);
            ps.setInt(3, idEntity);
            ps.executeUpdate();
            System.out.println("¡Zona de la entidad actualizada!");
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void modificarAddressDAO(int idEntity, int nuevoIdAddress, int idUserUpdate) {
        String sql = "UPDATE entity SET id_address = ?, id_user_update = ?, date_update = NOW() WHERE id_entity = ?;";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, nuevoIdAddress);
            ps.setInt(2, idUserUpdate);
            ps.setInt(3, idEntity);
            ps.executeUpdate();
            System.out.println("¡Dirección de la entidad actualizada!");
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void modificarStateDAO(int idEntity, int nuevoIdState, int idUserUpdate) {
        String sql = "UPDATE entity SET id_state = ?, id_user_update = ?, date_update = NOW() WHERE id_entity = ?;";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, nuevoIdState);
            ps.setInt(2, idUserUpdate);
            ps.setInt(3, idEntity);
            ps.executeUpdate();
            System.out.println("¡Estado de la entidad actualizado!");
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void modificarDescriptionDAO(int idEntity, String nuevaDescription, int idUserUpdate) {
        String sql = "UPDATE entity SET description = ?, id_user_update = ?, date_update = NOW() WHERE id_entity = ?;";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevaDescription);
            ps.setInt(2, idUserUpdate);
            ps.setInt(3, idEntity);
            ps.executeUpdate();
            System.out.println("¡Descripción de la entidad actualizada!");
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void modificarPhoneDAO(int idEntity, String nuevoPhone, int idUserUpdate) {
        String sql = "UPDATE entity SET phone = ?, id_user_update = ?, date_update = NOW() WHERE id_entity = ?;";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevoPhone);
            ps.setInt(2, idUserUpdate);
            ps.setInt(3, idEntity);
            ps.executeUpdate();
            System.out.println("¡Teléfono de la entidad actualizado!");
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void modificarEmailDAO(int idEntity, String nuevoEmail, int idUserUpdate) {
        String sql = "UPDATE entity SET email = ?, id_user_update = ?, date_update = NOW() WHERE id_entity = ?;";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevoEmail);
            ps.setInt(2, idUserUpdate);
            ps.setInt(3, idEntity);
            ps.executeUpdate();
            System.out.println("¡Email de la entidad actualizado!");
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void modificarWwwDAO(int idEntity, String nuevoWww, int idUserUpdate) {
        String sql = "UPDATE entity SET www = ?, id_user_update = ?, date_update = NOW() WHERE id_entity = ?;";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevoWww);
            ps.setInt(2, idUserUpdate);
            ps.setInt(3, idEntity);
            ps.executeUpdate();
            System.out.println("¡Sitio web (WWW) de la entidad actualizado!");
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void modificarLinkDAO(int idEntity, String nuevoLink, int idUserUpdate) {
        String sql = "UPDATE entity SET link = ?, id_user_update = ?, date_update = NOW() WHERE id_entity = ?;";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevoLink);
            ps.setInt(2, idUserUpdate);
            ps.setInt(3, idEntity);
            ps.executeUpdate();
            System.out.println("¡Link de la entidad actualizado!");
        } catch (SQLException e) { e.printStackTrace(); }
    }
}
