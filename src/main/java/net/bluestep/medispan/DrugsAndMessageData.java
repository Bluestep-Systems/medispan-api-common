package net.bluestep.medispan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DrugsAndMessageData {
  private List<String> drugs;
  private String message;
}
