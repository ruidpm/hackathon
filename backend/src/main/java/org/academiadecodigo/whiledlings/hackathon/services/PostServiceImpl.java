package org.academiadecodigo.whiledlings.hackathon.services;

import org.academiadecodigo.whiledlings.hackathon.persistence.dao.PostDao;
import org.academiadecodigo.whiledlings.hackathon.persistence.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private PostDao postDao;

    @Autowired
    public void setPostDao(PostDao postDao) {
        this.postDao = postDao;
    }

    @Override
    public Post getPost(Integer id) {
        return postDao.findById(id);
    }

    @Override
    public void deletePost(Integer id) {
        postDao.delete(id);
    }

    @Override
    public Post savePost(Post post) {
        return postDao.saveOrUpdate(post);
    }

    @Override
    public List<Post> getAllPosts() {
        return postDao.listAll();
    }
}
