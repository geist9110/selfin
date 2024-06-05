package org.selfin.controller.api;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.selfin.dto.EditedQnaDTO;
import org.selfin.dto.QnaDTO;
import org.selfin.dto.QnaReceiveDTO;
import org.selfin.service.EditService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EditAPI {

    private final EditService editService;

    @PostMapping(value = "/edit")
    public ResponseEntity<EditedQnaDTO> edit(
        @RequestBody QnaReceiveDTO qnaReceiveDTO
    ) {
        return ResponseEntity.ok(editService.edit(qnaReceiveDTO));
    }
}

