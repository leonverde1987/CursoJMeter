/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Matias
 */
@Entity
@Table(name = "adm_usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdmUsuarios.findAll", query = "SELECT a FROM AdmUsuarios a"),
    @NamedQuery(name = "AdmUsuarios.findByIdadmUsuarios", query = "SELECT a FROM AdmUsuarios a WHERE a.idadmUsuarios = :idadmUsuarios"),
    @NamedQuery(name = "AdmUsuarios.findByAdmUsuNombre", query = "SELECT a FROM AdmUsuarios a WHERE a.admUsuNombre = :admUsuNombre"),
    @NamedQuery(name = "AdmUsuarios.findByAdmUsuApellidos", query = "SELECT a FROM AdmUsuarios a WHERE a.admUsuApellidos = :admUsuApellidos"),
    @NamedQuery(name = "AdmUsuarios.findByAdmUsuCalle", query = "SELECT a FROM AdmUsuarios a WHERE a.admUsuCalle = :admUsuCalle"),
    @NamedQuery(name = "AdmUsuarios.findByAdmUsuColonia", query = "SELECT a FROM AdmUsuarios a WHERE a.admUsuColonia = :admUsuColonia"),
    @NamedQuery(name = "AdmUsuarios.findByAdmUsuExterior", query = "SELECT a FROM AdmUsuarios a WHERE a.admUsuExterior = :admUsuExterior"),
    @NamedQuery(name = "AdmUsuarios.findByAdmUsuInterior", query = "SELECT a FROM AdmUsuarios a WHERE a.admUsuInterior = :admUsuInterior"),
    @NamedQuery(name = "AdmUsuarios.findByAdmUsuContrasena", query = "SELECT a FROM AdmUsuarios a WHERE a.admUsuContrasena = :admUsuContrasena"),
    @NamedQuery(name = "AdmUsuarios.findByAdmUsuUsuario", query = "SELECT a FROM AdmUsuarios a WHERE a.admUsuUsuario = :admUsuUsuario")})
public class AdmUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idadm_usuarios")
    private Integer idadmUsuarios;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "adm_usu_nombre")
    private String admUsuNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "adm_usu_apellidos")
    private String admUsuApellidos;
    @Size(max = 45)
    @Column(name = "adm_usu_calle")
    private String admUsuCalle;
    @Size(max = 45)
    @Column(name = "adm_usu_colonia")
    private String admUsuColonia;
    @Column(name = "adm_usu_exterior")
    private Integer admUsuExterior;
    @Size(max = 10)
    @Column(name = "adm_usu_interior")
    private String admUsuInterior;
    @Size(max = 45)
    @Column(name = "adm_usu_contrasena")
    private String admUsuContrasena;
    @Size(max = 45)
    @Column(name = "adm_usu_usuario")
    private String admUsuUsuario;

    public AdmUsuarios() {
    }

    public AdmUsuarios(Integer idadmUsuarios) {
        this.idadmUsuarios = idadmUsuarios;
    }

    public AdmUsuarios(Integer idadmUsuarios, String admUsuNombre, String admUsuApellidos) {
        this.idadmUsuarios = idadmUsuarios;
        this.admUsuNombre = admUsuNombre;
        this.admUsuApellidos = admUsuApellidos;
    }

    public Integer getIdadmUsuarios() {
        return idadmUsuarios;
    }

    public void setIdadmUsuarios(Integer idadmUsuarios) {
        this.idadmUsuarios = idadmUsuarios;
    }

    public String getAdmUsuNombre() {
        return admUsuNombre;
    }

    public void setAdmUsuNombre(String admUsuNombre) {
        this.admUsuNombre = admUsuNombre;
    }

    public String getAdmUsuApellidos() {
        return admUsuApellidos;
    }

    public void setAdmUsuApellidos(String admUsuApellidos) {
        this.admUsuApellidos = admUsuApellidos;
    }

    public String getAdmUsuCalle() {
        return admUsuCalle;
    }

    public void setAdmUsuCalle(String admUsuCalle) {
        this.admUsuCalle = admUsuCalle;
    }

    public String getAdmUsuColonia() {
        return admUsuColonia;
    }

    public void setAdmUsuColonia(String admUsuColonia) {
        this.admUsuColonia = admUsuColonia;
    }

    public Integer getAdmUsuExterior() {
        return admUsuExterior;
    }

    public void setAdmUsuExterior(Integer admUsuExterior) {
        this.admUsuExterior = admUsuExterior;
    }

    public String getAdmUsuInterior() {
        return admUsuInterior;
    }

    public void setAdmUsuInterior(String admUsuInterior) {
        this.admUsuInterior = admUsuInterior;
    }

    public String getAdmUsuContrasena() {
        return admUsuContrasena;
    }

    public void setAdmUsuContrasena(String admUsuContrasena) {
        this.admUsuContrasena = admUsuContrasena;
    }

    public String getAdmUsuUsuario() {
        return admUsuUsuario;
    }

    public void setAdmUsuUsuario(String admUsuUsuario) {
        this.admUsuUsuario = admUsuUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idadmUsuarios != null ? idadmUsuarios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdmUsuarios)) {
            return false;
        }
        AdmUsuarios other = (AdmUsuarios) object;
        if ((this.idadmUsuarios == null && other.idadmUsuarios != null) || (this.idadmUsuarios != null && !this.idadmUsuarios.equals(other.idadmUsuarios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.AdmUsuarios[ idadmUsuarios=" + idadmUsuarios + " ]";
    }
    
}
