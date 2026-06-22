package dao;

import config.Conexion;
import entity.EntityCategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntityCategoryDAO {

    public void crearEntityCategory(EntityCategory ec, int idUser) {
        String sql = """
            INSERT INTO entity_category 
            (id_entity, id_category, id_user_create, id_user_update, date_create, date_update) 
            VALUES (?, ?, ?, ?, NOW(), NOW());
            """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, ec.getIdEntity());
            ps.setInt(2, ec.getIdCategory());
            ps.setInt(3, idUser);
            ps.setInt(4, idUser);

            ps.executeUpdate();
            System.out.println("¡Categoría de entidad creada con éxito!");

        } catch (SQLException e) {
            System.out.println("Error al intentar crear la categoría de entidad: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void modificarEntityCategory(EntityCategory ec, int idUserUpdate) {
        String sql = """
            UPDATE entity_category 
            SET id_entity = ?, id_category = ?, id_user_update = ?, date_update = NOW() 
            WHERE id_entity_category = ?;
            """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, ec.getIdEntity());
            ps.setInt(2, ec.getIdCategory());
            ps.setInt(3, idUserUpdate);
            ps.setInt(4, ec.getIdEntityCategory());

            ps.executeUpdate();
            System.out.println("¡Categoría de entidad modificada con éxito!");

        } catch (SQLException e) {
            System.out.println("Error al intentar modificar la categoría de entidad: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void borrarEntityCategory(int idEntityCategory) {
        String sql = """
            DELETE FROM entity_category WHERE id_entity_category = ?;
            """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idEntityCategory);

            ps.executeUpdate();
            System.out.println("¡Categoría de entidad borrada con éxito!");

        } catch (SQLException e) {
            System.out.println("Error al intentar borrar la categoría de entidad: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
        public void borrarEntityCategory2(int idEntity) {
        String sql = """
            DELETE FROM entity_category WHERE id_entity = ?;
            """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idEntity);

            ps.executeUpdate();
            System.out.println("¡Categoría de entidad borrada con éxito!");

        } catch (SQLException e) {
            System.out.println("Error al intentar borrar la categoría de entidad: " + e.getMessage());
            e.printStackTrace();
        }
    }
    

    public List<EntityCategory> listar() {
        String sql = "SELECT * FROM entity_category";
        List<EntityCategory> lista = new ArrayList<>();

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                EntityCategory ec = new EntityCategory();

                ec.setIdEntityCategory(rs.getInt("id_entity_category"));
                ec.setIdEntity(rs.getInt("id_entity"));
                ec.setIdCategory(rs.getInt("id_category"));
                ec.setDateCreate(rs.getTimestamp("date_create"));
                ec.setDateUpdate(rs.getTimestamp("date_update"));

                lista.add(ec);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar categorías de entidad: " + e.getMessage());
            e.printStackTrace();
        }

        return lista;
    }

//Modificadores "update" especificos
    public void modificarEntity(int idEntityCategory, int nuevoIdEntity, int idUserUpdate) {
        String sql = """
            UPDATE entity_category 
            SET id_entity = ?, id_user_update = ?, date_update = NOW() 
            WHERE id_entity_category = ?;
            """;
        try (Connection conn = Conexion.getConnection(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, nuevoIdEntity);
            ps.setInt(2, idUserUpdate);
            ps.setInt(3, idEntityCategory);
            
            ps.executeUpdate();
            System.out.println("¡Relación de Entidad (id_entity) actualizada con éxito!");
        } catch (SQLException e) { 
            e.printStackTrace(); 
        }
    }

    public void modificarCategory(int idEntityCategory, int nuevoIdCategory, int idUserUpdate) {
        String sql = """
            UPDATE entity_category 
            SET id_category = ?, id_user_update = ?, date_update = NOW() 
            WHERE id_entity_category = ?;
            """;
        try (Connection conn = Conexion.getConnection(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, nuevoIdCategory);
            ps.setInt(2, idUserUpdate);
            ps.setInt(3, idEntityCategory);
            
            ps.executeUpdate();
            System.out.println("¡Categoría (id_category) actualizada con éxito!");
        } catch (SQLException e) { 
            e.printStackTrace(); 
        }
    }
}
