package dio.budgeting.application;

import dio.budgeting.domain.Category;
import dio.budgeting.domain.TransactionRepository;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class GetTotalByCategoryUseCase {

    private final TransactionRepository transactionRepository;

    public GetTotalByCategoryUseCase(
            TransactionRepository transactionRepository
    ) {
        this.transactionRepository = transactionRepository;
    }

    @Tool(
            name = "get-total-by-category",
            description = "Calcula o valor total gasto em uma categoria"
    )
    public Long execute(
            @ToolParam(description = "Categoria da transação")
            Category category
    ) {
        return transactionRepository.getTotalByCategory(category);
    }
}