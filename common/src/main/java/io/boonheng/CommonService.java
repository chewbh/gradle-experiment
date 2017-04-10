package io.boonheng;

import org.springframework.stereotype.Component;

@Component
public class CommonService {

  public boolean test() {
    return Math.random() > 0.5;
  }

}
