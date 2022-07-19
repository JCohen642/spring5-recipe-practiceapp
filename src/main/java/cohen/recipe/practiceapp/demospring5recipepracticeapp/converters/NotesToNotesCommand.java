package cohen.recipe.practiceapp.demospring5recipepracticeapp.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import cohen.recipe.practiceapp.demospring5recipepracticeapp.commands.NotesCommand;
import cohen.recipe.practiceapp.demospring5recipepracticeapp.domain.Notes;
import lombok.Synchronized;


@Component
public class NotesToNotesCommand implements Converter<Notes, NotesCommand>{

    @Synchronized
    @Nullable
    @Override
    public NotesCommand convert(Notes source) {
        if (source == null) {
            return null;
        }

        final NotesCommand notesCommand = new NotesCommand();
        notesCommand.setId(source.getId());
        notesCommand.setRecipeNotes(source.getRecipeNotes());
        return notesCommand;
    }
    
}
