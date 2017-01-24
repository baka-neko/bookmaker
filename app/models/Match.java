package models;

import play.data.validation.Required;
import play.db.jpa.Model;
import play.i18n.Messages;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
    public Team hostTeam;

    @Required
    @ManyToOne
    public Team guestTeam;

    @Required
    @ManyToOne
    public Score score;

    //Удаляем все ставки на матч при удалении матча
    @OneToMany(mappedBy="match", cascade= CascadeType.ALL)
    public List<Bet> bets;

    public Match(Date date, Team team1, Team team2, Score score) {
        this.date = date;
        this.hostTeam = team1;
        this.guestTeam = team2;
        this.score = score;
    }

    public String toString() {
        return date.toString() + " " + Messages.get("app.match.description", hostTeam.fullname, guestTeam.fullname);
    }
}
