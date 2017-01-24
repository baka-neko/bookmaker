package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

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

    //Удаляем все матчи с участием команды при удалении этой команды
    @OneToMany(mappedBy="hostTeam", cascade= CascadeType.ALL)
    public List<Match> matchesAsHost;
    @OneToMany(mappedBy="guestTeam", cascade= CascadeType.ALL)
    public List<Match> matchesAsGuest;

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
