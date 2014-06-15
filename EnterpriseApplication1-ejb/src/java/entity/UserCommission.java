/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jakub
 */
@Entity
@Table(name = "userCommission")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserCommission.findAll", query = "SELECT u FROM UserCommission u"),
    @NamedQuery(name = "UserCommission.findById", query = "SELECT u FROM UserCommission u WHERE u.id = :id"),
    @NamedQuery(name = "UserCommission.findByUserId", query = "SELECT u FROM UserCommission u WHERE u.userId = :userId"),
    @NamedQuery(name = "UserCommission.findByTransportId", query = "SELECT u FROM UserCommission u WHERE u.transportId = :transportId")})
public class UserCommission implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "userId")
    private int userId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transportId")
    private int transportId;

    public UserCommission() {
    }

    public UserCommission(Integer id) {
        this.id = id;
    }

    public UserCommission(Integer id, int userId, int transportId) {
        this.id = id;
        this.userId = userId;
        this.transportId = transportId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTransportId() {
        return transportId;
    }

    public void setTransportId(int transportId) {
        this.transportId = transportId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserCommission)) {
            return false;
        }
        UserCommission other = (UserCommission) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.UserCommission[ id=" + id + " ]";
    }
    
}
