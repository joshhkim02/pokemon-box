import { Typography, Container, Box, Button } from '@mui/material';

export default function Landing() {
  return (
    <Box>
      {/* Hero Image */}
      {/* <Box
        component='img'
        src='https://images.unsplash.com/photo-1748257615880-6243d0d7422f?q=80&w=2093&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D'
        alt='Test Image'
        sx={{
          height: 'auto',
          width: { xs: '60%', sm: '70%', md: '100%' },
          maxWidth: '100%',
          order: { xs: 1, md: 2 },
        }}
      ></Box> */}


      <Box
        sx={{
          backgroundImage: `url(src/assets/heroImage.png)`,
          backgroundPositionY: '70%',
          backgroundSize: 'cover',
          backgroundRepeat: 'no-repeat',
          minHeight: '80vh',
          width: '100%',
          display: 'flex',
          justifyContent: 'center',
          alignItems: 'center',
        }}
      >
        <Box
          sx={{
            display: 'flex',
            flexDirection: 'column',
            justifyContent: 'center',
            alignItems: 'center',
            gap: '1em',
          }}
        >
          <Typography
            variant='h1'
            fontWeight='bold'
            color='#c93f3a'
            sx={{
              fontSize: { xs: '3rem', sm: '3.5rem', md: '5rem', lg: '6rem' },
            }}
          >
            PokéBox
          </Typography>
          <Typography
            variant='h6'
            fontWeight='bold'
            color='#c93f3a'
            sx={{
              fontSize: { xs: '1rem', sm: '1rem', md: '1.2rem', lg: '1.7rem' },
            }}
          >
            A Generation 1 Pokédex
          </Typography>
          <Button
            variant='contained'
            sx={{
              height: '7vh',
              borderRadius: '50px',
              fontSize: {
                xs: '.8rem',
                sm: '1rem',
                md: '1.3rem',
                lg: '1.5rem',
              },
              padding: { xs: '1em', sm: '1.3em', md: '1.3em', lg: '1.5em' },
            }}
          >
            GET STARTED
          </Button>
        </Box>
      </Box>

      {/* Next section */}
      <Container
        maxWidth='lg'
        sx={{
          height: '50vh',
          p: '1em',
          gap: { xs: 0, md: '5em' },
          display: 'flex',
          flexDirection: { xs: 'column', md: 'row' },
          justifyContent: 'space-between',
          alignItems: 'center',
        }}
      >
        <Box
          sx={{
            display: 'flex',
            flexDirection: 'column',
            padding: '1em',
            gap: '1em',
            alignItems: 'center',
          }}
        >
          <Typography variant='h4' textAlign='center'>
            Information on your favorite generation 1 Pokemon
          </Typography>
          <Button
            variant='contained'
            sx={{
              height: '5vh',
              width: '75%',
              borderRadius: '50px',
              fontSize: {
                xs: '.8rem',
                sm: '1rem',
                md: '1.3rem',
                lg: '1.5rem',
              },
              padding: { xs: '1em', sm: '1.3em', md: '1.3em', lg: '1.5em' },
            }}
          >
            Try it now
          </Button>
        </Box>

        <Box
          component='img'
          src='src/assets/heroImage.png'
          alt='Demo picture'
          sx={{
            width: '50%'
          }}
        >


        </Box>


      </Container >
    </Box >
  );
}
