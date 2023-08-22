package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "car_rental_company")
@Entity
public class CarRentalCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "company_name")
    private String companyName;
    @Column(name="address")
    private String address;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "tax_number")
    private String taxNumber;
    @Column(name = "bank_account_number")
    private String bankAccountNumber;
    @Column(name="is_verified")
    private boolean isVerified;


}
