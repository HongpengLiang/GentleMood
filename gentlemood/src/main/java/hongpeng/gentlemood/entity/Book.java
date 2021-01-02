package hongpeng.gentlemood.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hongpeng.liang
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {

    private static final long serialVersionUID = 1141959272135541543L;

    @TableId(value = "book_id", type = IdType.AUTO)
    private Integer bookId;
    private String bookName;
    private Integer bookCount;
    private String detail;
}
