package edu.sjsu.cmpe.project.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saung
 *
 */
public class LinksDto {
    private List<LinkDto> links = new ArrayList<LinkDto>();

    public void addLink(LinkDto link) {
	links.add(link);
    }

    /**
     * @return the links
     */
    public List<LinkDto> getLinks() {
	return links;
    }

    /**
     * @param links
     *            the links to set
     */
    public void setLinks(List<LinkDto> links) {
	this.links = links;
    }
    
    public String addLink1(String s) {
    	return "[]";
        }

}
