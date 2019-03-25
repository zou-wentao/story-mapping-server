package cn.nju.edu.model;

public class ProjectDetail extends Project {
	private Contributor[] contributors;
	private String projectCards;

	public ProjectDetail(int projectId, String projectTitle, String projectContent, int ownerId, String ownerEmail,
			String ownerName, Contributor[] contributors, String projectCards) {
		super(projectId, projectTitle, projectContent, ownerId, ownerEmail, ownerName);
		this.projectCards = projectCards;
		this.contributors = contributors;
	}

	public Contributor[] getContributors() {
		return contributors;
	}

	public String getProjectCards() {
		return projectCards;
	}
	
}