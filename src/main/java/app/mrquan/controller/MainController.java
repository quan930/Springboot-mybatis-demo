package app.mrquan.controller;

import app.mrquan.mapper.PersonMapper;
import app.mrquan.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private PersonMapper personMapper;
    @ResponseBody
    @RequestMapping(value = "/quan",method = RequestMethod.GET)
    public List<Person> textGet() {
        return personMapper.getAll();
    }

    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public void textPost(@RequestBody Person  bean) {
        personMapper.insert(bean);
    }
}
