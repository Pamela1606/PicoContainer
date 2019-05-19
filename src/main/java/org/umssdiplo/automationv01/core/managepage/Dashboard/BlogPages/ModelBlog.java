package org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages;

public class ModelBlog {

    private String Post;
    private String Category;
    private String Settings;

    ModelBlog(String post, String category, String settings) {
        this.setPost(post);
        this.setCategory(category);
        this.setSettings(settings);
    }

    public String getPost() {
        return Post;
    }

    public void setPost(String post) {
        Post = post;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getSettings() {
        return Settings;
    }

    public void setSettings(String settings) {
        Settings = settings;
    }
}

