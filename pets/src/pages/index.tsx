import type { NextPage } from 'next';
import List from '../ui/components/List/List';
import { Photo } from '../ui/components/List/List.style';
import Title from '../ui/components/Title/Title';

const Home: NextPage = () => {
  return (
    <div>
      <Title title="" subtitle={
        <span>
          Com um pequeno valor mensal, você <br />
          pode <strong>adotar um pet virtualmente</strong>
        </span>
      } />

      <List
        pets={[
          {
            id: 1,
            name: 'Back',
            details: 'History of back. tyjsjyjtykuylfykfk k uyk uyk yu',
            photo: 'https://t3.ftcdn.net/jpg/03/06/37/22/360_F_306372291_8RtHL5R9ETkZadUdpp6PYrXSsmqRwqhv.jpg'
          },
          {
            id: 2,
            name: 'Close',
            details: 'History of close. asdasdajty jtyj tyj tjk tj tymdpasmda',
            photo: 'https://media.istockphoto.com/photos/playful-happy-smiling-pet-dog-running-in-the-grass-picture-id1320018473?b=1&k=20&m=1320018473&s=170667a&w=0&h=Q-U9yI4JjCJYSAzXZwpnM4HuaXPzo4K-vBsgO7lanyo='
          },
          {
            id: 3,
            name: 'Hemi-Hol',
            details: 'History of Hemi. asdasasdasdasdasdasdafsddfjtjdamdpasmda',
            photo: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3Zr3Wv9qcUapON-J18b8ley8p-_g6-OOLDO8wCMWlNl3yI6oxoxqIg439UVFxTSLTklc&usqp=CAU'
          }
        ]}
      />
    </div>
  )
}

export default Home
