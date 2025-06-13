package com.condominio.app.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

/**
 * Contract class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contract extends BaseModel {

    //Id providenciado por BaseModel

    // Datas importantes
    private Instant startDate;        // Data de início da locação
    private Instant endDate;          // Data de término acordada (vigência)
    private Instant terminationDate;  // Quando foi encerrado (se for o caso)

    // Partes envolvidas
    private Person landlord;   // Locador
    private Person tenant;     // Locatário
    private Property property; // Imóvel alugado

    // Valores e obrigações
    private BigDecimal rentAmount;          // Valor mensal
    private BigDecimal depositAmount;       // Caução, se houver
    private GuaranteeType guaranteeType;    // Tipo de garantia ou fiador
    private String guaranteeDetails;        // Para detalhar se preciso (a garantia)
    private PaymentMethod paymentMethod;    // Ex: PIX, boleto, débito automático
    private Frequency paymentFrequency;     // Ex: MENSAL, TRIMESTRAL, etc…
    private List<Installment> installments; // Parcelas futuras e histórico

    // Regras
    private boolean allowsPets;              // Se permite animais (Não vi se por lei tem restrição por tipo)
    private boolean includesCondominiumFees; // Taxa de condomínio (Se aplicável)
    private boolean includesUtilities;       // Água/luz/gás inclusos? Ou se for o caso temos de fazer um ENUM também
    private boolean autoRenewal;             // Se a renovação for do tipo automático

    // Status
    private ContractStatus status; // ATIVO, ENCERRADO, CANCELADO, etc…

    // Assinaturas e informações de segurança
    private String contractNumber; // Código/identificador ou código de barras talvez
    private String registryNumber; // Número no cartório (se aplicável)
    private String signatureHash;  // Hash de verificação ou token para assinatura digital

    // Observações adicionais talvez uma descrição específica para o administrador ler no sistema
    private String notes;
}