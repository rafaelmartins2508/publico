package br.com.framework.blog.utils;

import br.com.framework.blog.model.Post;
import br.com.framework.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    BlogRepository blogRepository;

    //@PostConstruct
    public void savePosts(){

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Karine");
        post1.setData(LocalDate.now());
        post1.setTitulo("Mamãe");
        post1.setTexto("No ano de 2020 eu recebi o melhor presente do mundo, meu filho chamado KAEL");

        Post post2 = new Post();
        post2.setAutor("Kael");
        post2.setData(LocalDate.now());
        post2.setTitulo("Filho");
        post2.setTexto("Eu tenho a melhor mamãe do mundo!");

        postList.add(post1);
        postList.add(post2);

        for(Post post: postList){
            Post postSaved = blogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
