package dao;

import config.Conexion;
import entity.CollaboratorAttach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CollaboratorAttachDAO {
    
    public void CrearCollAtt (CollaboratorAttach attch){
        String sql = """
                     INSERT INTO collaborator_attach
                     (id_collaborator, data_type, attached_data, description, id_state, id_user_update,id_user_create, date_update, date_register)
                     VALUES (?,?,?,?,?,?,?, NOW(),NOW());
                     """;
        
    try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, attch.getIdcollaborator());
            ps.setString(2, attch.getDatatype());
            ps.setString(3, attch.getAttacheddata());
            ps.setString(4, attch.getDescription());
            ps.setInt(5, attch.getIdState());
            ps.setInt(6, attch.getIdUserUpdate());
            ps.setInt(7, attch.getIdUserCreate());

           
            ps.executeUpdate();
            System.out.println("¡ColaboradorAdjunto creado con éxito!");

        } catch (SQLException e) {
            System.out.println("Error al intentar crear el ColaboradorAdjunto: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ModificarCollAtt (CollaboratorAttach attch){
            String sql = """
                         UPDATE collaboratorattach
                         SET id_collaborator = ?, data_type = ?, attached_data = ?, description = ?, id_state = ?, id_user_update = ?, data_update = NOW ()
                         WHERE id_collaborator_attach = ?;
                         """;
            
            try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, attch.getIdcollaborator());
            ps.setString(2, attch.getDatatype());
            ps.setString(3, attch.getAttacheddata());
            ps.setString(4, attch.getDescription());
            ps.setInt(5, attch.getIdState());
            ps.setInt(6, attch.getIdUserUpdate());
            ps.setInt(7, attch.getIdCollaboratorAttach());

           
            ps.executeUpdate();
            System.out.println("¡ColaboradorAdjunto modificado con éxito!");

        } catch (SQLException e) {
            System.out.println("Error al intentar modificar el colaboradorAdjunto: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void BorrarCollAtt (String valor){
        
        String sql = """
                    DELETE FROM collaboratoattach WHERE id_collaborator_attach
                     """;
        
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, valor);
            
            ps.executeUpdate();
            System.out.println("¡ColaboradorAdjunto borrar con éxito!");

        } catch (SQLException e) {
            System.out.println("Error al intentar borrar el ColaboradorAdjunto: " + e.getMessage());
            e.printStackTrace();
        }
    }
    

    public List<CollaboratorAttach> listarCollAtt() {

        String sql = "SELECT * FROM collaborator_attach";
        List<CollaboratorAttach> lista = new ArrayList<>();
        
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                CollaboratorAttach attch = new CollaboratorAttach();
                
                attch.setIdCollaboratorAttach(rs.getInt("idcollaboratorattach"));
                attch.setIdcollaborator(rs.getInt("idcollaborator"));
                attch.setDatatype(rs.getString("datatype"));
                attch.setAttacheddata(rs.getString("attacheddata"));
                attch.setDescription(rs.getString("description"));
                attch.setIdState(rs.getInt("id_state"));
                attch.setIdUserUpdate(rs.getInt("iduserupdate"));
                attch.setIdUserCreate(rs.getInt("idusercreate"));
                

                lista.add(attch);
            }

        } catch (SQLException e) {
            System.out.println("Error al intentar listar los ColaboradorAdjunto: " + e.getMessage());
            e.printStackTrace();
        }
        
        return lista;
    }
   
    //Modificadores individuales de los atributos
    
    public void modificarDataTypeCollAtt(int idCollaboratorAttach, String nuevoDataType, int idUserUpdate) {
    String sql = """
                 UPDATE collaborator_attach 
                 SET data_type = ?, id_user_update = ?, date_update = NOW() 
                 WHERE id_collaborator_attach = ?
                 """;
    try (Connection conn = Conexion.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        
        ps.setString(1, nuevoDataType);
        ps.setInt(2, idUserUpdate);
        ps.setInt(3, idCollaboratorAttach);
        
        ps.executeUpdate();
        System.out.println("¡Tipo de dato (data_type) actualizado con éxito!");
    } catch (SQLException e) {
        System.out.println("Error al modificar data_type: " + e.getMessage());
        e.printStackTrace();
        }
    }
    
    
    public void modificarAttachedDataCollAtt(int idCollaboratorAttach, String nuevoAttachedData, int idUserUpdate) {
        String sql = """
                 UPDATE collaborator_attach 
                 SET attached_data = ?, id_user_update = ?, date_update = NOW() 
                 WHERE id_collaborator_attach = ?
                 """;
    try (Connection conn = Conexion.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        
        ps.setString(1, nuevoAttachedData);
        ps.setInt(2, idUserUpdate);
        ps.setInt(3, idCollaboratorAttach);
        
        ps.executeUpdate();
        System.out.println("¡Datos adjuntos (attached_data) actualizados con éxito!");
    } catch (SQLException e) {
        System.out.println("Error al modificar attached_data: " + e.getMessage());
        e.printStackTrace();
        }
    }   
    
    
    public void modificarDescriptionCollAtt(int idCollaboratorAttach, String nuevaDescription, int idUserUpdate) {
        String sql = """
                 UPDATE collaborator_attach 
                 SET description = ?, id_user_update = ?, date_update = NOW() 
                 WHERE id_collaborator_attach = ?
                 """;
    try (Connection conn = Conexion.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        
        ps.setString(1, nuevaDescription);
        ps.setInt(2, idUserUpdate);
        ps.setInt(3, idCollaboratorAttach);
        
        ps.executeUpdate();
        System.out.println("¡Descripción actualizada con éxito!");
    } catch (SQLException e) {
        System.out.println("Error al modificar la descripción: " + e.getMessage());
        e.printStackTrace();
        }
    }
    
    
    public void modificarEstadoAdjuntoCollAtt(int idCollaboratorAttach, int nuevoIdState, int idUserUpdate) {
    String sql = """
                 UPDATE collaborator_attach 
                 SET id_state = ?, id_user_update = ?, date_update = NOW() 
                 WHERE id_collaborator_attach = ?
                 """;
    try (Connection conn = Conexion.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        
        ps.setInt(1, nuevoIdState);
        ps.setInt(2, idUserUpdate);
        ps.setInt(3, idCollaboratorAttach);
        
        ps.executeUpdate();
        System.out.println("¡Estado del adjunto (id_state) actualizado con éxito!");
    } catch (SQLException e) {
        System.out.println("Error al modificar el estado del adjunto: " + e.getMessage());
        e.printStackTrace();
    }
}
}
