package sno.assess.backendjr.service.commentService;

import org.springframework.stereotype.Service;
import sno.assess.backendjr.entity.Comment;
import sno.assess.backendjr.service.IService;

/**
 * Author: Justin Scott Jenecke
 * Service interface to enforce rules on Comment business logic
 * Date: 13/10/2021
 * */

@Service
public interface ICommentService extends IService <Comment, String> {
}
