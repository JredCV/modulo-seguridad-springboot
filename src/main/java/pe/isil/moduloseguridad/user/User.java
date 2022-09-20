package pe.isil.moduloseguridad.user;

import javax.persistence.*;

@Entity
@Table(name = "tbl_User",
        uniqueConstraints = {
                @UniqueConstraint(name="mail_unique", columnNames ="mail" ),
                @UniqueConstraint(name="document_unique", columnNames ="document" )
            }
        )

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mail", nullable = false, unique = true)
    private String email;

    @Column(name = "pass", nullable = false)
    private String password;

    @Column(name = "username", nullable = true)
    private String name;

    @Column(name = "document", nullable = false)
    private String document;
}
