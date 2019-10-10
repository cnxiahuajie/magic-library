package work.codehub.magiclibrary.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * 响应对象 .<br>
 *
 * @author andy.sher
 * @date 2019/10/10 18:18
 */
@Data
@Builder
public class ResponseEntity {

    public Integer code;

    private String msg;

    private Object data;

    public static ResponseEntity ok(Object data) {
        return ok(HttpStatus.OK.getReasonPhrase(), data);
    }

    public static ResponseEntity ok(String msg, Object data) {
        return ResponseEntity.builder().code(HttpStatus.OK.value()).msg(msg).data(data).build();
    }

}
