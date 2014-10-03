package com.nirdosh.vaadin;

import javax.persistence.EntityManager;

import com.google.gwt.user.client.ui.TabBar.Tab;
import com.nirdosh.domain.User;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class MainUI extends UI{
	
	public static final String PERSISTENCE_UNIT = "com.nirdosh";

	final HorizontalSplitPanel horizontalSplitPanel = new HorizontalSplitPanel();
	final JPAContainer<User> container = JPAContainerFactory.make(User.class, "com.nirdosh");
	final Table userList = new Table();
	final FormLayout editorLayout = new FormLayout();
	private FieldGroup editorFields = new FieldGroup();
	private TextField searchField = new TextField();
	private Button addNewUserButton = new Button("NEW");
	private Button removeUserButton = new Button("Remove");
	
	
	@Override
	protected void init(VaadinRequest request) {
		initLayout();
		intUserList();
		
	}

	private void initLayout() {
		/* Root of the user interface component tree is set */
		HorizontalSplitPanel splitPanel = new HorizontalSplitPanel();
		setContent(splitPanel);
		
		VerticalLayout leftLayout = new VerticalLayout();
		splitPanel.addComponent(leftLayout);
		splitPanel.addComponent(editorLayout);
		
		leftLayout.addComponent(userList);
		
		HorizontalLayout bottomLeftLayout = new HorizontalLayout();
		leftLayout.addComponent(bottomLeftLayout);
		bottomLeftLayout.addComponent(searchField);
		bottomLeftLayout.addComponent(addNewUserButton);
		
		leftLayout.setSizeFull();
		
		leftLayout.setExpandRatio(userList, 1);
		userList.setSizeFull();
		
		bottomLeftLayout.setWidth("100%");
		searchField.setWidth("100%");
		bottomLeftLayout.setExpandRatio(searchField, 1);
		
		editorLayout.setMargin(true);
		editorLayout.setVisible(false);
		
	}

	
	private void intUserList() {
		// TODO Auto-generated method stub
		userList.setContainerDataSource(container);
		userList.setSelectable(true);
		userList.setVisibleColumns(new String[]{"name","surname","spiritualName"});
		
	}
	static {
		EntityManager em = JPAContainerFactory.createEntityManagerForPersistenceUnit("com.nirdosh");

		long size = (Long) em.createQuery("SELECT COUNT(p) FROM User p").getSingleResult();
		if (size == 0) {
			// create two Person objects as test data

			em.getTransaction().begin();
			User boss = new User();
			boss.setName("John");
			boss.setSurname("Bigboss");
			boss.setSpiritualName("Spiritual");
			em.persist(boss);

			User p = new User();
			p.setName("Marc");
			p.setSurname("Hardworker");
			p.setSpiritualName("test");
			
			em.persist(p);

			em.getTransaction().commit();
		}

	}

}
