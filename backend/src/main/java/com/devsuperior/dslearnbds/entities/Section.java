package com.devsuperior.dslearnbds.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_section")
public class Section implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Integer position;
    private String imgUri;
    
    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;

    @ManyToOne
    @JoinColumn(name = "prerequisite_id")
    private Section prerequisite;

    public Section() {
    }

    public Section(Long id, String title, String description, Integer position, String imgUri, Resource resource, Section prerequisite) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.position = position;
        this.imgUri = imgUri;
        this.resource = resource;
        this.prerequisite = prerequisite;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPosition() {
        return this.position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getImgUri() {
        return this.imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public Resource getResource() {
        return this.resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Section getPrerequisite() {
        return this.prerequisite;
    }

    public void setPrerequisite(Section prerequisite) {
        this.prerequisite = prerequisite;
    }

    public Section id(Long id) {
        setId(id);
        return this;
    }

    public Section title(String title) {
        setTitle(title);
        return this;
    }

    public Section description(String description) {
        setDescription(description);
        return this;
    }

    public Section position(Integer position) {
        setPosition(position);
        return this;
    }

    public Section imgUri(String imgUri) {
        setImgUri(imgUri);
        return this;
    }

    public Section resource(Resource resource) {
        setResource(resource);
        return this;
    }

    public Section prerequisite(Section prerequisite) {
        setPrerequisite(prerequisite);
        return this;
    }

}
