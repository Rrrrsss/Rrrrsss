package com.htgy.actions;
/*
 * 注册Controller层
 */
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import com.htgy.registform.RegistForm;

@SuppressWarnings("deprecation")
public class RegistAction extends SimpleFormController{
    private String rFailView;
    private String rSuccessView;
    
    
    public String getRFailView() {
        return rFailView;
    }


    public void setRFailView(String rFailView) {
        this.rFailView = rFailView;
    }


    public String getRSuccessView() {
        return rSuccessView;
    }


    public void setRSuccessView(String rSuccessView) {
        this.rSuccessView = rSuccessView;
    }


    @Override
     protected ModelAndView onSubmit(HttpServletRequest request,
                HttpServletResponse response, Object command, BindException errors)
                throws Exception {
        //讲表单的参数封装到command中
        RegistForm rf = (RegistForm)command;
        if (rf.getAccount().equals("111111") && rf.getPassFirst().equals("123456")
                &&rf.getPassSecond().equals("123456")){
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("LoginForm", rf);
            List<String> msgList = new LinkedList<String>();
            msgList.add("你好，Spring MVC");
            map.put("msg", msgList);
            //返回视图和模型，this.getRSuccessView()为视图，map为模型
            return new ModelAndView(this.getRSuccessView(),map);
        }else{
            return new ModelAndView(this.getRFailView());
        }
        }
    
}