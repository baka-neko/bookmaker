package models;

import play.data.validation.Required;
import play.db.jpa.Model;
import play.i18n.Messages;

import javax.persistence.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: Spek
 * Date: 24.01.17
 * Time: 0:05
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Score extends Model {

    @Required
    public byte hostTeam_score;

    @Required
    public byte guestTeam_score;

    public Score(byte hostTeam_score, byte guestTeam_score) {
        this.hostTeam_score = hostTeam_score;
        this.guestTeam_score = guestTeam_score;
    }

    public String toString() {
        return Messages.get("app.score.description", String.valueOf(hostTeam_score), String.valueOf(guestTeam_score));
    }
}
