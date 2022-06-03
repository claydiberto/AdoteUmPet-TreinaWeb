import {
    ListStyled,
    ItemList,
    Photo,
    Info,
    Name,
    Details
} from './List.style';

import { Button } from '@mui/material';
import { Pet } from '../../../data/@types/Pet';
import { TextService } from '../../../data/services/TextService'

interface ListProps {
    pets: Pet[];
}

export default function List(props: ListProps) {
    const maxSizeText = 200;

    return (
        <ListStyled>
            {props.pets.map(pet => (
                <ItemList key={pet.id}>
                    <Photo src={pet.photo} alt={pet.name} />
                    <Info>
                        <Name>{pet.name}</Name>
                        <Details>{TextService.limitText(pet.details, maxSizeText)}</Details>
                        <Button variant={'contained'} fullWidth>Adotar {pet.name}</Button>
                    </Info>
                </ItemList>
            ))}
        </ListStyled>
    )
}