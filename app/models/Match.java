package models;

import play.data.validation.Required;
import play.db.jpa.Model;
import play.i18n.Messages;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Spek
 * Date: 24.01.17
 * Time: 0:05
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="football_match")
public class Match extends Model {

    @Required
    public Date date;

    @Required
    @ManyToOne
    public Team team1;

    @Required
    @ManyToOne
    public Team team2;

    @Required
    @ManyToOne
    public Score score;

    public Match(Date date, Team team1, Team team2, Score score) {
        this.date = date;
        this.team1 = team1;
        this.team2 = team2;
        this.score = score;
    }

    public String toString() {
        return date.toString() + " " + Messages.get("app.match.description", team1.fullname, team2.fullname);
    }
}
