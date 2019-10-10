package work.codehub.magiclibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 文章控制器 .<br>
 *
 * @author andy.sher
 * @date 2019/10/10 18:34
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @GetMapping("/detail")
    @ResponseBody
    public String detail() throws Exception {
        StringBuffer stringBuffer = new StringBuffer();

        try (FileInputStream fis = new FileInputStream("C:\\Users\\Albert\\Documents\\服务器大全.html"); InputStreamReader streamReader = new InputStreamReader(fis, "UTF-8"); BufferedReader br = new BufferedReader(streamReader);) {
            String line;
            while ((line = br.readLine()) != null) {
                stringBuffer.append(line);
            }
        } catch (Throwable th) {
            throw th;
        }

        return stringBuffer.toString();
    }

}
