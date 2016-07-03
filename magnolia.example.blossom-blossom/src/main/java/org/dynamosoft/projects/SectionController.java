package org.dynamosoft.projects;

import info.magnolia.module.blossom.annotation.Template;

import javax.jcr.Node;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Template(id = "myModule:pages/section", title = "Section Template")
@Controller
public class SectionController {
 
    @RequestMapping("/section")
    public String render(Node pageNode, Node componentNode) {
    	 return "myModule/pages/main2.ftl";
    }
}