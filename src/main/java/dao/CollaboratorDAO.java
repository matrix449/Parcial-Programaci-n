package dao;

import config.Conexion;
import entity.Collaborator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CollaboratorDAO {

    public void CrearColl(Collaborator colab) {
        String sql = """
            INSERT INTO collaborator 
            (id_user, id_entity, number_document, id_state, id_user_update, id_user_create, date_register, date_update) 
            VALUES (?, ?, ?, ?, ?, ?, ?, NOW(), NOW());
            """;

        
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, colab.getIdUser());
            ps.setInt(2, colab.getIdState());
            ps.setInt(3, colab.getIdEntity());
            ps.setString(4, colab.getNumberDocument());
            ps.setInt(5, colab.getIdUserUpdate());
            ps.setInt(6, colab.getIdUserCreate());

           
            ps.executeUpdate();
            System.out.println("¡Colaborador creado con éxito!");

        } catch (SQLException e) {
            System.out.println("Error al intentar crear el colaborador: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
public void modificarColl(Collaborator colab) { // Solo pasamos el objeto colab completo
    
    // Corregidos los puntos y comas por comas ordinarias (,)
    String sql = """
                 UPDATE collaborator
                 SET id_user = ?,id_entity = ?,number_document = ?,id_state = ?,id_user_update = ?,date_update = NOW() 
                 WHERE id_collaborator = ?;
                 """;
    
    try (Connection conn = Conexion.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        
        ps.setInt(1, colab.getIdUser());
        ps.setInt(2, colab.getIdEntity());
        ps.setString(3, colab.getNumberDocument());     
        ps.setInt(4, colab.getIdState());
        ps.setInt(5, colab.getIdUserUpdate());
        ps.setInt(6, colab.getIdCollaborator()); 

        ps.executeUpdate();
        System.out.println("¡Colaborador modificado con éxito!");

    } catch (SQLException e) {
        System.out.println("Error al intentar modificar el colaborador: " + e.getMessage());
        e.printStackTrace();
    }
}
    
    public void borrarColl (String nrodocument){
        
        String sql = """
            DELETE FROM collaborator WHERE number_documente = ?
              """;
        
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nrodocument);
            
            ps.executeUpdate();
            System.out.println("¡Colaborador borrar con éxito!");

        } catch (SQLException e) {
            System.out.println("Error al intentar borrar el colaborador: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
 public List<Collaborator> listar() {
        String sql = "SELECT * FROM collaborator";
        List<Collaborator> lista = new ArrayList<>();
        
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                
                Collaborator colab = new Collaborator();
                
                colab.setIdCollaborator(rs.getInt("id_collaborator"));
                colab.setIdUser(rs.getInt("id_user"));
                colab.setIdEntity(rs.getInt("id_entity"));
                colab.setNumberDocument(rs.getString("number_document"));
                colab.setIdState(rs.getInt("id_state"));
                
                
                lista.add(colab);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar colaboradores: " + e.getMessage());
            e.printStackTrace();
        }
        
        return lista;
    }
 
//Modificadores "update" especificos
 
public void modificarUsuarioColl(int idCollaborator, int nuevoIdUser, int idUserUpdate) {
        String sql = """
                 UPDATE collaborator 
                 SET id_user = ?, id_user_update = ?, date_update = NOW() 
                 WHERE id_collaborator = ?
                 """;
    try (Connection conn = Conexion.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        
        ps.setInt(1, nuevoIdUser);
        ps.setInt(2, idUserUpdate);
        ps.setInt(3, idCollaborator);
        
        ps.executeUpdate();
        System.out.println("¡Usuario del colaborador actualizado!");
    } catch (SQLException e) {
        e.printStackTrace();
        }
    }

 
public void modificarDocumentoColl(int idCollaborator, int nuevoNroDocumento, int idUserUpdate) {
        String sql = """
                 UPDATE collaborator 
                 SET number_document = ?, id_user_update = ?, date_update = NOW() 
                 WHERE id_collaborator = ?
                 """;
    try (Connection conn = Conexion.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        
        ps.setInt(1, nuevoNroDocumento);
        ps.setInt(2, idUserUpdate);
        ps.setInt(3, idCollaborator);
        
        ps.executeUpdate();
        System.out.println("¡Número de documento actualizado con éxito!");
    } catch (SQLException e) {
        e.printStackTrace();
        }
    }
    
public void modificarEstadoColl(int idCollaborator, int nuevoIdState, int idUserUpdate) {
        String sql = """
                 UPDATE collaborator 
                 SET id_state = ?, id_user_update = ?, date_update = NOW() 
                 WHERE id_collaborator = ?
                 """;
    try (Connection conn = Conexion.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        
        ps.setInt(1, nuevoIdState);
        ps.setInt(2, idUserUpdate);
        ps.setInt(3, idCollaborator);
        
        ps.executeUpdate();
        System.out.println("¡Estado del colaborador actualizado correctamente!");
    } catch (SQLException e) {
        e.printStackTrace();
        }
    }

}
