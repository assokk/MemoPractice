package org.example.memo.dto;


import lombok.Getter;
import org.example.memo.entity.Memo;

@Getter
public class MemoResponseDto {

    private Long id;
    private String title;
    private String contents;

    // 생성자
    // 클라이언트에게 응답 생성 시, memo 객체를 보내기 적합한 형태로 바꾸기 위한 용도
    public MemoResponseDto(Memo memo) {
        this.id = memo.getId();
        this.title = memo.getTitle();
        this.contents = memo.getContents();
    }
}
