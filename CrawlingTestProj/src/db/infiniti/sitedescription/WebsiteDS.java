package db.infiniti.sitedescription;

public class WebsiteDS {
	//engineid, name, url, description, status, comments, template, item_xp, link_xp, title_xp, description_xp, thumb_xp
	int engineid;
	String name;
	String Description;
	String Address;//url
	String status;
	String template;
	String comments;
	String itemXPath;
	String linkXPath;
	String descXPath;
	String titleXPath;
	String thumbNXPath;
	String next_page_xp;
	boolean acceptsStopWords;

	public WebsiteDS(int engineid, String name, String description, String address, String template, String itemXPath, String linkXPath,	String descXPath, String titleXPath,
	String thumbNXPath) {
		super();
/*		Address = address;
		this.itemXPath = itemXPath;
		Description = description;*/
	}

	public WebsiteDS() {
		super();
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getItemXPath() {
		return itemXPath;
	}

	public void setItemXPath(String itemXPath) {
		this.itemXPath = itemXPath;
	}

	public String getLinkXPath() {
		return linkXPath;
	}

	public void setLinkXPath(String linkXPath) {
		this.linkXPath = linkXPath;
	}

	public String getDescXPath() {
		return descXPath;
	}

	public void setDescXPath(String descXPath) {
		this.descXPath = descXPath;
	}

	public String getTitleXPath() {
		return titleXPath;
	}

	public void setTitleXPath(String titleXPath) {
		this.titleXPath = titleXPath;
	}

	public String getThumbNXPath() {
		return thumbNXPath;
	}

	public void setThumbNXPath(String thumbNXPath) {
		this.thumbNXPath = thumbNXPath;
	}

	public int getEngineid() {
		return engineid;
	}

	public void setEngineid(int engineid) {
		this.engineid = engineid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getNextPageXP() {
		return this.next_page_xp;
	}

	public void setNextPageXP(String Next_Page_XP) {
		this.next_page_xp = Next_Page_XP;
	}
	public boolean isAcceptsStopWords() {
		return acceptsStopWords;
	}

	public void setAcceptsStopWords(boolean acceptsStopWords) {
		this.acceptsStopWords = acceptsStopWords;
	}

}
