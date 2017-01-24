package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: Spek
 * Date: 24.01.17
 * Time: 0:04
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Team extends Model {

    @Required
    public String fullname;
    public String logoURL;

    public Team(String fullname) {
        this.fullname = fullname;
    }

    public Team(String fullname, String logoURL) {
        this.fullname = fullname;
        this.logoURL = logoURL;
    }

    public String toString() {
        return fullname;
    }
}
