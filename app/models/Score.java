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
    public byte team1_score;

    @Required
    public byte team2_score;

    public Score(byte team1_score, byte team2_score) {
        this.team1_score = team1_score;
        this.team2_score = team2_score;
    }

    public String toString() {
        return Messages.get("app.score.description", String.valueOf(team1_score), String.valueOf(team2_score));
    }
}
