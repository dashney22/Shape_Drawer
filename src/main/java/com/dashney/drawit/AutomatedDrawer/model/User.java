package com.dashney.drawit.AutomatedDrawer.model;
import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private String password;
    // FetchType.EAGER makes sure that a user is retrieved along with their role/s
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="Users_Role", joinColumns = @JoinColumn(name="user_id", referencedColumnName = "id")
            ,inverseJoinColumns = @JoinColumn(name="role_id", referencedColumnName = "id"))
    private Collection<Role> role;

    public User() {
    }

    public User(String firstName, String lastName, String email, String password, Collection<Role> role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Role> getRole() {
        return role;
    }

    public void setRole(Collection<Role> role) {
        this.role = role;
    }
}
