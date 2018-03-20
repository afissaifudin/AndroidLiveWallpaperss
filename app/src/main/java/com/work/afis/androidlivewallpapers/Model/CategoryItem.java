package com.work.afis.androidlivewallpapers.Model;

/**
 * Created by Afis on 16/03/2018.
 */

public class CategoryItem {
    public String name;
    public String link;

    public CategoryItem(){

    }

    public CategoryItem(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
