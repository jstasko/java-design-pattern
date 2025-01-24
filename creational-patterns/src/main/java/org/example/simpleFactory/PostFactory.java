package org.example.simpleFactory;

// acts as simple factory for creation of different posts on web
public class PostFactory {
    public static Post createPost(String type) {
        return switch (type) {
            case "blog" -> new BlogPost();
            case "news" -> new NewsPost();
            case "product" -> new ProductPost();
            default -> throw new IllegalArgumentException("Post type is unknown");
        };
    }
}
