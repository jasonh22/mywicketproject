package nl.undefine;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Created by jason on 5/25/16.
 */
public class TestPage extends WebPage {

    public TestPage(PageParameters parameters) {
//        super(parameters);

        if (null != parameters.get("name")) {
            add(new Label("text", "I see your GET parameter"));
        }
    }

    // non-bookmarkable constructor
    public TestPage() {

    }

    private void createComponents () {
        // do cheesy stuff with the cheese
    }
}
