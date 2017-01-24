package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created with IntelliJ IDEA.
 * User: Spek
 * Date: 24.01.17
 * Time: 0:05
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Bet extends Model {

    @Required
    @ManyToOne
    public User author;

    @Required
    @ManyToOne
    public Match match;

    @Required
    @ManyToOne
    public Score score;

    public Bet(User author, Match match, Score score) {
        this.author = author;
        this.match = match;
        this.score = score;
    }

    //    public check()
//    - full|winner|fail
}
