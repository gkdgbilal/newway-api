package com.newway.newwayapi.project;

import javax.persistence.*;

@Entity //tablo yapmak için yazdık.
public class Project {
    @Id //tabloda her verinin unique değeri olsun
    @GeneratedValue(strategy = GenerationType.IDENTITY)//her gelen yeni veri için
                                                        //artan sayıda id atar.
    private Long id;
    @Column(nullable = false)
    private String projectName;
    @Column(nullable = false)
    private String projectDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }
}
