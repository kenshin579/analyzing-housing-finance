package kakaopay.housingfinance.service;

import kakaopay.housingfinance.dto.BankDto;
import kakaopay.housingfinance.entity.Bank;
import kakaopay.housingfinance.repository.BankRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BankService {
    private final BankRepository bankRepository;

    public BankService(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    // TODO MAPSTRUCT 구현
    public Map<String,Object> getAllBanks() {
        List<Bank> banks = bankRepository.findAll();
        List<BankDto> bankDtoList = new ArrayList<>();
        for (Bank bank : banks) {
            bankDtoList.add(
                    BankDto.builder()
                            .name(bank.getName())
                            .build()
            );
        }
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("bank",bankDtoList);
        return resultMap;
    }


}
