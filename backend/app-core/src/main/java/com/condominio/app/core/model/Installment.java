package com.condominio.app.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Installment class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Installment extends BaseModel {
    //Id providenciado por BaseModel
    private int number;               // Número da parcela (ex: 1, 2, 3…)
    private LocalDate dueDate;        // Data de vencimento
    private LocalDate paymentDate;    // Quando foi paga (se já foi)
    private BigDecimal amount;        // Valor original da parcela
    private BigDecimal paidAmount;    // Valor pago
    private BigDecimal penaltyRate;   // Multa por atraso (%)
    private BigDecimal interestRate;  // Juros ao dia (%)
    private Person chargeResponsible; // Responsável pelo pagamento

    private InstallmentStatus status; // PENDENTE, PAGA, ATRASADA, CANCELADA

    private UUID contractId; // Referência ao contrato (se não estiver embutido)

    private String paymentReference; // Código boleto/PIX, hash de transação etc…
    private String notes;            // Observações (ex: motivo da diferença no valor)
}