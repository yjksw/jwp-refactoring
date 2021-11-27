package kitchenpos.dto.request;

public class OrderTableEmptyRequestDto {

    private boolean empty;

    private OrderTableEmptyRequestDto() {
    }

    public OrderTableEmptyRequestDto(boolean empty) {
        this.empty = empty;
    }

    public boolean isEmpty() {
        return empty;
    }
}