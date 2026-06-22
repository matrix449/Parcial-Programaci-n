package dao;

import config.Conexion;
import entity.DimensionEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DimensionEntityDAO {

    
    public void crearDimensionEntity(DimensionEntity de) {
        String sql = """
            INSERT INTO dimension_entity 
            (id_entity, id_zone, category_count, entity_density, competition_level, id_user_create, id_user_update, date_create, date_update) 
            VALUES (?, ?, ?, ?, ?, ?, ?, NOW(), NOW());
            """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, de.getIdEntity());
            ps.setInt(2, de.getIdZone());
            ps.setInt(3, de.getCategoryCount());
            ps.setDouble(4, de.getEntityDensity()); // Usamos setDouble para el tipo decimal
            ps.setString(5, de.getCompetitionLevel());
            ps.setInt(6, de.getIdUserCreate());
            ps.setInt(7, de.getIdUserUpdate());

            ps.executeUpdate();
            System.out.println("¡Dimensión de entidad creada con éxito!");

        } catch (SQLException e) {
            System.out.println("Error al intentar crear la dimensión de entidad: " + e.getMessage());
            e.printStackTrace();
        }
    }


    public void modificarDimensionEntity(DimensionEntity de) {
        String sql = """
            UPDATE dimension_entity
            SET id_zone = ?, category_count = ?, entity_density = ?, competition_level = ?, id_user_update = ?, date_update = NOW() 
            WHERE id_dimension_entity = ?;
            """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, de.getIdZone());
            ps.setInt(2, de.getCategoryCount());
            ps.setDouble(3, de.getEntityDensity());
            ps.setString(4, de.getCompetitionLevel());
            ps.setInt(5, de.getIdUserUpdate());
            ps.setInt(6, de.getIdDimensionEntity());

            ps.executeUpdate();
            System.out.println("¡Dimensión de entidad modificada con éxito!");

        } catch (SQLException e) {
            System.out.println("Error al intentar modificar la dimensión de entidad: " + e.getMessage());
            e.printStackTrace();
        }
    }


    public void borrarDimensionEntity(int idDimensionEntity) {
        String sql = """
            DELETE FROM dimension_entity WHERE id_dimension_entity = ?;
            """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idDimensionEntity);

            ps.executeUpdate();
            System.out.println("¡Dimensión de entidad borrada con éxito!");

        } catch (SQLException e) {
            System.out.println("Error al intentar borrar la dimensión de entidad: " + e.getMessage());
            e.printStackTrace();
        }
    }


    public List<DimensionEntity> listar() {
        String sql = "SELECT * FROM dimension_entity";
        List<DimensionEntity> lista = new ArrayList<>();

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                DimensionEntity de = new DimensionEntity();

                de.setIdDimensionEntity(rs.getInt("id_dimension_entity"));
                de.setIdEntity(rs.getInt("id_entity"));
                de.setIdZone(rs.getInt("id_zone"));
                de.setCategoryCount(rs.getInt("category_count"));
                de.setEntityDensity(rs.getDouble("entity_density"));
                de.setCompetitionLevel(rs.getString("competition_level"));
                de.setIdUserCreate(rs.getInt("id_user_create"));
                de.setIdUserUpdate(rs.getInt("id_user_update"));
                

                lista.add(de);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar dimensiones de entidad: " + e.getMessage());
            e.printStackTrace();
        }

        return lista;
    }

//Modificadores "update" especificos

    public void modificarZoneDE(int idDimensionEntity, int nuevoIdZone, int idUserUpdate) {
        String sql = """
            UPDATE dimension_entity 
            SET id_zone = ?, id_user_update = ?, date_update = NOW() 
            WHERE id_dimension_entity = ?;
            """;
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, nuevoIdZone);
            ps.setInt(2, idUserUpdate);
            ps.setInt(3, idDimensionEntity);

            ps.executeUpdate();
            System.out.println("¡Zona de la dimensión actualizada con éxito!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void modificarCategoryCountDE(int idDimensionEntity, int nuevoCategoryCount, int idUserUpdate) {
        String sql = """
            UPDATE dimension_entity 
            SET category_count = ?, id_user_update = ?, date_update = NOW() 
            WHERE id_dimension_entity = ?;
            """;
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, nuevoCategoryCount);
            ps.setInt(2, idUserUpdate);
            ps.setInt(3, idDimensionEntity);

            ps.executeUpdate();
            System.out.println("¡Conteo de categorías actualizado con éxito!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void modificarEntityDensityDE(int idDimensionEntity, double nuevaEntityDensity, int idUserUpdate) {
        String sql = """
            UPDATE dimension_entity 
            SET entity_density = ?, id_user_update = ?, date_update = NOW() 
            WHERE id_dimension_entity = ?;
            """;
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDouble(1, nuevaEntityDensity);
            ps.setInt(2, idUserUpdate);
            ps.setInt(3, idDimensionEntity);

            ps.executeUpdate();
            System.out.println("¡Densidad de entidad actualizada con éxito!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void modificarCompetitionLevelDE(int idDimensionEntity, String nuevoCompetitionLevel, int idUserUpdate) {
        String sql = """
            UPDATE dimension_entity 
            SET competition_level = ?, id_user_update = ?, date_update = NOW() 
            WHERE id_dimension_entity = ?;
            """;
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nuevoCompetitionLevel);
            ps.setInt(2, idUserUpdate);
            ps.setInt(3, idDimensionEntity);

            ps.executeUpdate();
            System.out.println("¡Nivel de competencia actualizado con éxito!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}