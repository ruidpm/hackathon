package org.academiadecodigo.whiledlings.hackathon.exception;

public class PostNotFoundException extends ReconnectException{
    public PostNotFoundException() {
        super("Post not found");
    }
}
