package sg.edu.nus.iss.paf_workshop2.model;

import java.sql.Date;

import javax.security.auth.callback.ConfirmationCallback;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RSVP {
    private int id;
    private String fullName;
    private int phoneNo;
    private Date Confirmation_date;
    private String text;


}
