package com.myblog.myblog11.controller;

import com.myblog.myblog11.payload.PostDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {



    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        //dto is used to send custom response back

    }

}
