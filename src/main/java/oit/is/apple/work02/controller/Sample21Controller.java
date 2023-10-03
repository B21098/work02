package oit.is.apple.work02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Sample21Controller
 *
 * クラスの前に@Controllerをつけていると，HTTPリクエスト（GET/POSTなど）があったときに，このクラスが呼び出される
 */
@Controller
public class Sample21Controller {

  /**
   * sample21というGETリクエストがあったら sample21()を呼び出し，sample21.htmlを返す
   */
  @GetMapping("/sample21")
  public String sample21() {
    return "sample21.html";
  }

  @GetMapping("/sample22/{param1}/{param2}")
  public String sample22(@PathVariable String param1, @PathVariable String param2, ModelMap model) {
    int tasu = Integer.parseInt(param1);
    int tasareru = Integer.parseInt(param2);
    int tasuResult = tasu + tasareru;

    model.addAttribute("tasuResult1", tasuResult);
    return "sample21.html";
  }

}
