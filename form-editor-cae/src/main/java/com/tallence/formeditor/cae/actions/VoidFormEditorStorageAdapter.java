package com.tallence.formeditor.cae.actions;

import com.tallence.formeditor.elements.FormElement;
import com.tallence.formeditor.contentbeans.FormEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Void Adapter for only one reason: the cae is starting up without errors when integrating the extension.
 *
 * You should delete this adapter or add a {@link org.springframework.context.annotation.Primary} Annotation to your project-
 * adapter. Spring will complain about two Adapters otherwise.
 */
@Component
public class VoidFormEditorStorageAdapter implements FormEditorStorageAdapter {
  private static final Logger LOGGER = LoggerFactory.getLogger(VoidFormEditorStorageAdapter.class);

  @Override
  public boolean persistFormData(FormEditor target, String formData, List<FormElement<?>> elements, List<MultipartFile> files) {
    LOGGER.warn("VoidAdapter used to store form data: " + formData);
    return true;
  }
}
