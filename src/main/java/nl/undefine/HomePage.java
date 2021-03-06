package nl.undefine;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
		/* java code */
		PageParameters pageParameters = new PageParameters();
		pageParameters.add("name", "Blatest");
		add(new BookmarkablePageLink("link", TestPage.class, pageParameters));

		// TODO Add your page's components here

    }
}
