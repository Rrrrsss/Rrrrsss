package com.htgy.actions;

/*
 * 登录Controller层
 */
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import com.htgy.loginform.LoginForm;

@SuppressWarnings("deprecation")
public class LoginAction extends SimpleFormController {
    private String lFailView;
    private String lSuccessView;


    public String getLFailView() {
        return lFailView;
    }


    public void setLFailView(String lFailView) {
        this.lFailView = lFailView;
    }


    public String getLSuccessView() {
        return lSuccessView;
    }


    public void setLSuccessView(String lSuccessView) {
        this.lSuccessView = lSuccessView;
    }

    @Override
    protected ModelAndView onSubmit(HttpServletRequest request,
            HttpServletResponse response, Object command, BindException errors)
                    throws Exception {
        //讲表单的参数封装到command中
        LoginForm lf = (LoginForm)command;
        if (lf.getAccount().equals("111111") && lf.getPassword().equals("123456")){
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("LoginForm", lf);
            List<String> msgList = new LinkedList<String>();
            msgList.add("你好，Spring MVC");
            map.put("msg", msgList);
            System.out.println("登录成功");
            //返回视图和模型，this.getLSuccessView()为视图，map为模型
            return new ModelAndView(this.getLSuccessView(),map); 
        }else{
            return new ModelAndView(this.getLFailView());
        }
    }
}